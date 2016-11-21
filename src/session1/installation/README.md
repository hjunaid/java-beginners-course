## Development Tools Setup Guide

These step by step instructions will guide you through setting up your development environment and downloading the workshop exercises. 

The following tools are covered:

1. Eclipse IDE - A free, feature rich platform for general development work.

2. GIT - The most widely used version control system for source code.

3. JAVA 8 - Java Development Kit (JDK) which includes all the parts necessary to run and create Java applications.

### Eclipse IDE installation - MAC & Windows Users:

* Navigate to https://eclipse.org/downloads

* In the Get Eclipse Neon section, click Download and follow the instructions to download Eclipse IDE.

* Once downloaded, double click on downloaded file which will extract Eclipse Installer file. 

* Double click on Eclipse Installer file. 

* If you do not have Java JDK installed, eclipse will prompt you to install it. Please click 'Oracle JDK 1.8.0' -> Accept license agreement for 'Java SE Development Kit 8u111' -> Select appropriate Java bundle (for Windows this will typically be 'Windows x64', and 'Mac OS X' for MAC users) -> Double click downloaded file and follow the installation instructions -> Once completed navigate back to the downloaded Eclipse file to continue installing Eclipse

* Eclipse installer will start the installation process. 

* Click on Eclipse IDE for Java EE Developers.

* Select Default installation folder and click install. 

* Accept the Software User Agreement whenever asked to do so. 

* Select a workspace when prompted. Verify that you can see Welcome screen in Eclipse IDE. 

* Well done! You have successfully complete the installation of Eclipse IDE.  

### Git Installation guide  - MAC Users:

* Download git installer from https://git-scm.com/download/mac

* Double click on the downloaded file and continue with the instructions.

* Open a new terminal. Spotligh search -> enter 'terminal'

* Confirm that GIT has been successfully installed and is available on your user path by running this command: 'git --version'.  Output should verify GIT version.

### Git Installation guide - Windows Users:

* Download git installer from http://git-scm.com/download/win

* Double click on the downloaded file and continue with the instructions.

* Open a new command prompt. Click windows start -> run -> Enter: 'cmd' and enter

* Confirm that GIT has been successfully installed and is available on your user path by running this command: 'git --version'. Output should verify GIT version.

## Project setup instructions - MAC & Windows Users:

These step by step instructions will guide you through setting up the coding projects within Eclipse.

### Download project

* Choose somewhere on your filesystem to download the project - this can be anywhere. E.g 'C:/workspace/projects/java-training'

* Open a cmd prompt and navigate to the file path by running this command: 'cd C:/workspace/projects/java-training'

* Execute the following GIT command to download the source code for the workshop: 'git clone https://github.com/hjunaid/java-beginners-course.git'

* Launch Eclipse and choose select: File -> Import -> Git -> Projects from Git -> Next -> Existing local repository -> Add -> Browse -> (select where source code is downloaded) -> Click OK -> (Project should now be visible) -> Click Finish

* Projects should now be visible in Eclipse

* Congratulations! You are ready to code.