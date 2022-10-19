CREATE TABLE blog (
                      id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(500) NOT NULL,
                      content VARCHAR(5000) NOT NULL,
                      author VARCHAR(5000) NOT NULL
);
CREATE TABLE user_info(
                          id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                          username VARCHAR(50) NOT NULL,
                          password VARCHAR(500) NOT NULL,
                          fullname VARCHAR(50) NOT NULL
);