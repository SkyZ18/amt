# AMT (Article-Management-Tool)
This is a simple article management tool. You can add your articles to a Database and manage them via an API.

## Installation guide

> [!IMPORTANT]
> For this to work install Docker, Git, Node and Maven

### First Step
Verify that you have Node installed and run the command below:
```
node -v
```

https://nodejs.org/de/download

Mac:
```
brew install node
```

### Git
First run the Git command in a Folder of your choice:
```
git clone https://github.com/SkyZ18/amt.git
```
After this you can cd into the Project.

### Project in Intellij
Run Maven Clean && Package.
```
npm install
```

### Project not in Intellij
Make sure you installed Maven:
```
mvn -v
```
If Maven is not installed, follow this install guide for Windows: https://www.javatpoint.com/how-to-install-maven

If you are on Mac, install Homebrew and run:
```
brew install maven
```

### Download .zip
If you want to download the .zip file, go to https://github.com/SkyZ18/amt/archive/refs/heads/main.zip and save the .zip in a Folder of your choise. Then just extract it with 7Zip or WinRar and Follow the process above.

### Docker
After you ran the Package, initialize the Project. Open Docker and run these in the rootfolder cli of AMT:
```
docker-compose build
docker-compose up
```
Check if the Containers are running and call the URL **http://localhost:80/** for the Frontend view.