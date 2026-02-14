plugins {
    id("com.hayden.mcp")
    id("com.hayden.spring-app")
    id("com.hayden.paths")
}

group = "com.hayden"
version = "1.0.0"

tasks.register("prepareKotlinBuildScriptModel") {}

dependencies {
}

tasks.bootJar {
    archiveFileName = "test-mcp-server.jar"
}

tasks.compileJava {
    dependsOn(
        "processYmlFiles",
        "processXmlFiles",
    )
}

tasks.test {
    dependsOn(
        "processYmlFiles",
        "processXmlFiles"
    )
}
