## Development Tools Setup Guide

These step by step instructions will guide you through setting up your development environment and downloading the workshop exercises. 

The following tools are covered:

1. Eclipse IDE - A free, feature rich platform for general development work.

2. GIT - The most widely used version control system for source code.

3. JAVA 8 - Java Development Kit (JDK) which includes all the parts necessary to run and create Java applications.

### Eclipse IDE installation - MAC & Windows Users:

* Navigate to https://eclipse.org/downloads

* In the Get Eclipse Neon section, click Download and follow the instructions to download Eclipse IDE.

* Once downloaded, double click on the file which will extract Eclipse Installer file. 

* Double click on Eclipse Installer file. 

* If you do not have Java JDK installed, eclipse will prompt you to install it: 
  > <span style="font-size: 15px;">1. Click 'Oracle JDK 1.8.0' <br/>
  > 2. Accept license agreement for 'Java SE Development Kit 8u111' <br/>
  > 3. Select appropriate Java bundle (for Windows this will typically be 'Windows x64' and 'Mac OS X' for MAC users) <br/> 
  > 4. Double click downloaded file and follow the installation instructions <br/>
  > 5. Once completed navigate back to the downloaded Eclipse file to continue installing Eclipse <br/></style>

* Eclipse installer will start the installation process. 

* Click on Eclipse IDE for Java EE Developers.

* Select Default installation folder and click install. 

* Accept the Software User License Agreement whenever asked to do so. 

* Select a workspace when prompted. Verify that you can see the welcome screen in Eclipse. 

* Well done! You have successfully completed the installation of Eclipse.  

### Git Installation guide  - MAC Users:

* Download git installer from https://git-scm.com/download/mac

* Double click on the downloaded file and continue with the instructions.

* Open a new terminal. Spotlight search -> enter 'terminal'

* Confirm that GIT has been successfully installed and is available on your user path by running this command: 'git --version'. Output should verify GIT version.

### Git Installation guide - Windows Users:

* Download git installer from http://git-scm.com/download/win

* Double click on the downloaded file and continue with the instructions.

* Open a new command prompt. Click windows start -> run -> Enter: 'cmd' and enter

* Confirm that GIT has been successfully installed and is available on your user path by running this command: 'git --version'. Output should verify GIT version.

## Project setup instructions - MAC & Windows Users:

These step by step instructions will guide you through setting up the coding projects within Eclipse.

### Download project

* Choose somewhere on your filesystem to download the project - this can be anywhere. e.g 'C:/workspace/projects/java-training', '/documents/projects/java'

* Open a cmd prompt and navigate to the file path by running this command: 'cd C:/workspace/projects/java-training', 'cd '/documents/projects/java'

* Execute the following GIT command to download the source code for the workshop: 'git clone https://github.com/hjunaid/java-beginners-course.git'

* Launch Eclipse and do the following:
 > <span style="font-size: 15px;">1. Select File from top left panel <br/>
 > 2. Click Import -> Git -> Projects from Git -> Next <br/>
 > 3. Click Existing local repository -> Add -> Browse -> Select where source code is downloaded, this is java-beginners-course -> Click OK <br/> 
 > 4. (Project should now be visible) -> Select the project which is now visible -> Click Next <br/>
 > 5. Click checkbox 'Import as a general project' -> Click Next -> Click Finish <br/>
 > 6. Right click on the project in the Package Explorer -> Click properties <br/>
 > 7. Click Project Facets -> Click convert to faceted form <br/>
 > 8. Ensure Java 1.8 checkbox is selected -> Click OK <br/>
 
 Click Finish</span>

* Congratulations! You're ready to code.

### Troubleshooting

* If all else fails use this online editor!: https://www.compilejava.net/