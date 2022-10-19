CREATE TABLE user(
                          id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                          email VARCHAR(50) NOT NULL,
                          password VARCHAR(500) NOT NULL,
                          firstname VARCHAR(50) NOT NULL,
                          lastname varchar(50) not null,
                          mobilenumber varchar (50) not null,
                          roles int(6)
);

CREATE TABLE role{
            id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            role INT(6),
            FOREIGN KEY (role) REFERENCES user(id) ON DELETE CASCADE ON UPDATE CASCADE
    };
CREATE TABLE agency{
        id INT(6) UNSIGNED AUTO_INCREMENT primary key,
        code varchar(500) not null,
        name varchar(500) not null,
        details varchar(500) not null,
        owner int(6),
        foreign key(owner) REFERENCES user(id) ON DELETE CASCADE ON UPDATE CASCADE
    }

create table bus{
        id int(6) unsigned auto_increment primary key,
        code varchar(500) not null,
        capacity int(11) not null,
        make varchar(500) not null,
        agency int(6),
        foreign key(agency) REFERENCES agency(id) ON DELETE CASCADE ON UPDATE CASCADE
    }

create table ticket{
        id int(6) unsigned auto_increment primary key,
        seatnumber int(10) not null,
        cancellable boolean ,
        journeydate varchar(500) not null,
        passenger int(6),
        tripschedule int(6),
    foreign key(tripschedule) REFERENCES tripschedule(id) ON DELETE CASCADE ON UPDATE CASCADE
    }

create table stop{
    id int(6) unsigned auto_increment primary key,
    code varchar(500) not null,
    name varchar(500) not null,
    detail varchar(500) not null
    }

create table trip{
        id int(6) unsigned auto_increment primary key,
        fare int(6) ,
        journeytime varchar(500) not null,
        sourcestop int(6),
        deststop int(6),
        bus int(6),
        agency int(6),
    foreign key(sourcestop) REFERENCES stop(id) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(deststop) REFERENCES stop(id) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(agency) REFERENCES agency(id) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(bus) REFERENCES bus(id) ON DELETE CASCADE ON UPDATE CASCADE
    }

create table tripschedule{
    id int(6) unsigned auto_increment primary key,
    tripdate varchar(500) not null,
    availableseats int(6),
    tripdetail int(6),
    ticketsold json,
    foreign key(tripdetail) REFERENCES trip(id) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(ticketsold) REFERENCES ticket(id) ON DELETE CASCADE ON UPDATE CASCADE,

    }

