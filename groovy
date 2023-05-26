def contDownload(repo)
{
 git "http://github.com/myavddev/${repo}"
}
def contBuild()
{
 sh 'mvn package'
}
def contDep(Jobname,ipaddress,context)
{
 sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war
 ubuntu@{ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
}
def contTest(jobname)
{
 sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
 }
 
