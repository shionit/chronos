/* Book */
CREATE TABLE book (
 id NUMBER (8) NOT NULL PRIMARY KEY,
 title VARCHAR (256) NOT NULL,
 isbn VARCHAR (20),
 url VARCHAR (256)
);


-- initial data
INSERT INTO book (id, title, isbn) VALUES (1, 'This is me.', '123-444-56');
INSERT INTO book (id, title, isbn) VALUES (2, 'Hello world.', '246-777-89');
INSERT INTO book (id, title, isbn) VALUES (3, 'Apple pen', '369-000-54');
