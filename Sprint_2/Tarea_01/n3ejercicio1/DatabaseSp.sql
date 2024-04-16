DROP DATABASE IF EXISTS spotify;
CREATE DATABASE spotify;
USE spotify;


CREATE TABLE user(
	idUser INT PRIMARY KEY AUTO_INCREMENT,
    subscription ENUM ('free','premium')NOT NULL,
	email VARCHAR(45),
	password VARCHAR (20),
	nameUser VARCHAR (45),
	DOB DATE,
	gender ENUM ('male','female','other'),
	country VARCHAR(45),
	zip VARCHAR (10));
    
CREATE TABLE subs(
	idSubs INT PRIMARY KEY AUTO_INCREMENT,
    firstSubDate DATE,
    renovationDate DATE,
    payment ENUM ('PayPal','CreditCard')NOT NULL,
    userId INT,
    FOREIGN KEY (userId) REFERENCES user(idUser));
    
CREATE TABLE payPal(
    idPp INT PRIMARY KEY AUTO_INCREMENT,
    namePp VARCHAR (45),
    userId INT,
    FOREIGN KEY (userId) REFERENCES user(idUser));
    
    
CREATE TABLE creditCard(
    idCc INT PRIMARY KEY AUTO_INCREMENT,
    cardNum VARCHAR (60),
    expiration DATE,
    cod INT
    );
    
    
CREATE TABLE premiumPayment (
    idPay INT PRIMARY KEY AUTO_INCREMENT,
    datePay DATE,
    amount INT,
    subsId INT,
    FOREIGN KEY (subsId) REFERENCES subs (idSubs));
    
    
CREATE TABLE playlist(
    idPlaylist INT PRIMARY KEY AUTO_INCREMENT,
    namePlaylist VARCHAR(60),
    songs INT,
    datePlaylist TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    userId INT,
    deleted ENUM ('active', 'deleted') DEFAULT 'active',
    dateDeleted TIMESTAMP,
    FOREIGN KEY (userId) REFERENCES user(idUser));

    
    
    CREATE TABLE song(
    idSong INT PRIMARY KEY AUTO_INCREMENT,
    nameSong VARCHAR(45),
    songLength INT,
    plays INT,
    albumId INT,
    FOREIGN KEY (albumId) REFERENCES album(idAlbum));
    
    CREATE TABLE playlist_songs (
    playlistId INT,
    songId INT,
    PRIMARY KEY (playlistId, songId),
    FOREIGN KEY (playlistId) REFERENCES playlist(idPlaylist),
    FOREIGN KEY (songId) REFERENCES song(idSong));

    
    CREATE TABLE album(
    idAlbum INT PRIMARY KEY AUTO_INCREMENT,
    nameAlbum VARCHAR(45),
    cover BLOB,
    artistId INT,
    FOREIGN KEY (artistId) REFERENCES artist(idArtist));
    
    
    CREATE TABLE artist(
    idArtist INT PRIMARY KEY AUTO_INCREMENT,
    nameArtist VARCHAR (45),
    image BLOB);
    
