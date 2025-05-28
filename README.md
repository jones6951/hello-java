# hello-java
<!-- BADGES START -->

 <a href="https://sca.field-test.blackduck.com/api/projects/c06739e2-5c55-449a-a9a7-47ed9fe876c0/versions/d3aae981-f017-4757-86a6-21801d89a8a3/components?filter=policyRuleSeverity:BLOCKER&filter=policyRuleViolation:PR~a25d378b-eb92-48dc-9b8a-4339918aae54" target="_blank"><img src="https://img.shields.io/badge/MJ--No--EXPLOIT-2-880808?labelColor=000" alt="MJ--No--EXPLOIT"></a> <a href="https://sca.field-test.blackduck.com/api/projects/c06739e2-5c55-449a-a9a7-47ed9fe876c0/versions/d3aae981-f017-4757-86a6-21801d89a8a3/components?filter=policyRuleSeverity:BLOCKER&filter=policyRuleViolation:PR~c1f5ed2a-6211-48c7-a835-86bbc092b188" target="_blank"><img src="https://img.shields.io/badge/No+Exploitable+Vulnerabilities-2-880808?labelColor=000" alt="No+Exploitable+Vulnerabilities"></a> <a href="https://sca.field-test.blackduck.com/api/projects/c06739e2-5c55-449a-a9a7-47ed9fe876c0/versions/d3aae981-f017-4757-86a6-21801d89a8a3/components?filter=policyRuleSeverity:BLOCKER&filter=policyRuleViolation:PR~1e6e77aa-0629-4712-a610-dd6cd1eb6ac0" target="_blank"><img src="https://img.shields.io/badge/Raf+No+Exploitable+Vulns-2-880808?labelColor=000" alt="Raf+No+Exploitable+Vulns"></a> <a href="https://sca.field-test.blackduck.com/api/projects/c06739e2-5c55-449a-a9a7-47ed9fe876c0/versions/d3aae981-f017-4757-86a6-21801d89a8a3/components?filter=policyRuleSeverity:BLOCKER&filter=policyRuleViolation:PR~f39611c6-1edc-4e6b-9b58-6822e799b0ba" target="_blank"><img src="https://img.shields.io/badge/Show+Mediums+--+Blocker-1-880808?labelColor=000" alt="Show+Mediums+--+Blocker"></a> <a href="https://sca.field-test.blackduck.com/api/projects/c06739e2-5c55-449a-a9a7-47ed9fe876c0/versions/d3aae981-f017-4757-86a6-21801d89a8a3/components?filter=policyRuleSeverity:BLOCKER&filter=policyRuleViolation:PR~6e640893-3853-48a2-9027-257cabdaef7e" target="_blank"><img src="https://img.shields.io/badge/spm+No+Exploitable+Vulns-2-880808?labelColor=000" alt="spm+No+Exploitable+Vulns"></a>
<!-- BADGES END -->


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
