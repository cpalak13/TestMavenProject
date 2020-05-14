node { 
      stage ('SCM Checkout'){ 
             git 'https://github.com/cpalak13/TestMavenProject' 
             } 
      stage('Compile-Package'){
             def mvnHome = tool name: 'MavenHome', type:'maven' 
             sh "${mvnHome}/bin/mvn package"
             } 
             }
