plugins {
    `java-library`
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
    `java-test-fixtures`
    id("org.assertj.generator") version "1.1.0"
}

repositories {
    mavenCentral()
}

tasks.named("compileTestFixturesJava") {
    dependsOn(":application:core:generateAssertJ")
}
sourceSets {
    main {
        assertJ {
            // default: ${buildDir}/generated-srcs/${sourceSet.name}-test/java
            outputDir = file("src/testFixtures/java")

            templates {
                classes {
                    val directory = "src/main/resources/assertj/templates"
                    assertionClass.file("$directory/_ins_custom_assertion_class_template.txt")
                    entryPoints.assertions.file("$directory/_ins_standard_assertions_entry_point_class_template.txt")
                }
            }
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")

    testFixturesApi("org.assertj:assertj-core:3.25.1")
    //testFixturesCompileOnly("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testFixturesImplementation("jakarta.annotation:jakarta.annotation-api:2.1.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.bootJar {
    enabled = false
}
