# hello-java
<!-- BADGES START -->
 <img src="https://img.shields.io/badge/MJ--No--EXPLOIT-2-880808?labelColor=000" alt="MJ--No--EXPLOIT" title="Rapid scan results are not posted to Black Duck SCA"> <img src="https://img.shields.io/badge/No+Exploitable+Vulnerabilities-2-880808?labelColor=000" alt="No+Exploitable+Vulnerabilities" title="Rapid scan results are not posted to Black Duck SCA"> <img src="https://img.shields.io/badge/Raf+No+Exploitable+Vulns-2-880808?labelColor=000" alt="Raf+No+Exploitable+Vulns" title="Rapid scan results are not posted to Black Duck SCA"> <img src="https://img.shields.io/badge/spm+No+Exploitable+Vulns-2-880808?labelColor=000" alt="spm+No+Exploitable+Vulns" title="Rapid scan results are not posted to Black Duck SCA"> <img src="https://img.shields.io/badge/No+critical+vulns-2-D2042D?labelColor=000" alt="No+critical+vulns" title="Rapid scan results are not posted to Black Duck SCA"><!-- BADGES END -->


A simple hello world Java app with some coding errors for demoing SIG product integrations with various CI systems.

Build Commands
- [pom.xml](pom.xml) - mvn clean compile
- [build.xml](build.xml) - ant clean build
- [build.gradle](build.gradle) - gradle clean assemble

CI Integration Examples (configured for Maven)
- [.circleci/config.yml](.circleci/config.yml) - Circle CI pipeline
- [.github/workflows](.github/workflows) - example GitHub workflows
- [.gitlab-ci.yml](.gitlab-ci.yml) - GitLab CI pipeline
- [azure-pipelines](azure-pipelines) - example Azure DevOps pipelines
- [bitbucket](bitbucket) - example Bitbucket pipelines
- [jenkins](jenkins) - example Jenkins pipelines
- [Jenkinsfile](Jenkinsfile) - Coverity on Jenkins with full + incr scans using GitHub Branch Source plugin
- [polaris.yml](polaris.yml) - Polaris project configuration
