def call() {
    return sh(
        script: "hostname -I | awk '{print \$1}'",
        returnStdout: true
    ).trim()
}
