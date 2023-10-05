# AMT (Article-Management-Tool)
This is a simple article management tool. You can add your articles to a Database and manage them via an API.

## Installation guide

> [!IMPORTANT]
> For this to work install Docker and Git

### Git

First run the Git command in a Folder of your choice:
```
git clone https://github.com/SkyZ18/amt.git
```
After this you can cd into the Project and run the Docker commands.

### Download .zip
If you want to download the .zip file, go to https://github.com/SkyZ18/amt/archive/refs/heads/main.zip and save the .zip in a Folder of your choise. Then just extract it with 7Zip or WinRar. Also you can download the Sourcecode from the listed Releases.

### Docker
To initialize the Project, open Docker and run these in the rootfolder cli of AMT:
```
docker-compose build
docker-compose up
```
Check if the Containers are running and call the URL **http://localhost:80/** for the Frontend view.