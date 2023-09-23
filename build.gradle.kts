plugins {
    id("io.cloudflight.autoconfigure-gradle") version "1.0.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    dependencies {
        implementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.4"))
        implementation("org.springframework.boot:spring-boot-starter")
    }
}
