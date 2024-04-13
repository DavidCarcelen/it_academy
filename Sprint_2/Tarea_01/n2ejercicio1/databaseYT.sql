DROP DATABASE IF EXISTS youtube;
CREATE DATABASE youtube;
USE youtube;


CREATE TABLE user(
	idUser INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(45),
	password VARCHAR (20),
	nameUser VARCHAR (20),
	DOB DATE,
	gender ENUM ('male','female','other'),
	country VARCHAR(45),
	zip VARCHAR (10));


CREATE TABLE video(
	idVideo INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR (60),
	about TEXT,
	size INT,
	fileName VARCHAR(45),
	duration TIME,
	thumbnail BLOB,
	plays INT,
	likes INT,
	dislikes INT,
	userId INT,
	dateVideo TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (userId) REFERENCES user(idUser),
	state ENUM ('public', 'hidden', 'private') NOT NULL);

CREATE TABLE hashtag(
	idHashtag INT PRIMARY KEY AUTO_INCREMENT,
	nameHashtag VARCHAR (45));

CREATE TABLE videoHashtag(
    videoId INT,
    hashtagId INT,
    PRIMARY KEY (videoId, hashtagId),
    FOREIGN KEY (videoId) REFERENCES video(idVideo),
    FOREIGN KEY (hashtagId) REFERENCES hashtag(idHashtag));


CREATE TABLE `channel`(
	idChannel INT PRIMARY KEY AUTO_INCREMENT,
	nameChannel VARCHAR (60),
	decript TEXT,
	dateChannel TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	userId INT,
	FOREIGN KEY (userId) REFERENCES user(idUser));

CREATE TABLE subscription (
    idSubscription INT PRIMARY KEY AUTO_INCREMENT,
    userId INT,
    channelId INT,
    subscriptionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userId) REFERENCES user(idUser),
    FOREIGN KEY (channelId) REFERENCES channel(idChannel));


CREATE TABLE videoReaction (
    idVideoReaction INT PRIMARY KEY AUTO_INCREMENT,
    userId INT,
    videoId INT,
    reaction ENUM ('like', 'dislike') NOT NULL,
    reactionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userId) REFERENCES user(idUser),
    FOREIGN KEY (videoId) REFERENCES video(idVideo),
    UNIQUE KEY uniqueReaction (userId, videoId));



CREATE TABLE playlist(
	idPlaylist INT PRIMARY KEY AUTO_INCREMENT,
	namePlaylist VARCHAR(60),
	datePlaylist TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	state ENUM ('public','private') NOT NULL,
	userId INT,
	FOREIGN KEY (userId) REFERENCES user(idUser));


CREATE TABLE playlist_video (
    playlistId INT,
    videoId INT,
    PRIMARY KEY (playlistId, videoId),
    FOREIGN KEY (playlistId) REFERENCES playlist(idPlaylist),
    FOREIGN KEY (videoId) REFERENCES video(idVideo)
);
    


CREATE TABLE comments(
	idComments INT PRIMARY KEY AUTO_INCREMENT,
	body TEXT,
	dateComment TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    userId INT,
    FOREIGN KEY (userId) REFERENCES user(idUser));
    
CREATE TABLE commentReaction (
    idCommentReaction INT PRIMARY KEY AUTO_INCREMENT,
    userId INT,
    commentId INT,
    reaction ENUM ('like', 'dislike') NOT NULL,
    reactionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userId) REFERENCES user(idUser),
    FOREIGN KEY (commentId) REFERENCES comments(idComments),
    UNIQUE KEY uniqueReaction (userId, commentId));


