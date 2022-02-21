# Homework #1

Setup, Build, and Running Program Steps:

1.Open Ubunut Virtual Machine. 

2.Install gradle, eclipse, and java just as explained in this link provided by the professor: 
http://cs.iit.edu/~virgil/cs445/mail.spring2022/tools-setup/linux-eclipse-gradle.html

3.Clone this repository onto your machine by doing :
$ sudo apt install git
$ git --version
$ git clone https://gitlab.com/cameronmcnz/gitlab-made-easy.git
$ cd this-github-repo
$ git config --global user.email "ubuntu-clone@example.com"
$ git config --global user.name "cameronmcnz"

4.Open eclipse and import the gradle project by doing File > Import > Gradle > Existing Gradle Project > Next > Next > Browse and select the directory you cloned from git > Next > check the 'Override workspace settings' , select 'Local installation directory' and type /opt/gradle/latest in the text box; then select Next and Finish.

5.Then,  Go back to the terminal; you should be in ~/eclipse-workspace/HW1-gradle/

(i) Build the project:

  

  $ ./gradlew build
  

(ii) Run the project:

  

  $ ./gradlew run


You can view all tasks available for execution by running:

  

  $ ./gradlew tasks
  


