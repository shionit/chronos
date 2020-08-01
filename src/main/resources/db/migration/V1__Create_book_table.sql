/* Book */
CREATE TABLE book (
 id NUMBER (8) NOT NULL IDENTITY PRIMARY KEY,
 title VARCHAR (256) NOT NULL,
 isbn VARCHAR (16),
 url VARCHAR (256),
 published_date DATE
);


-- initial data
INSERT INTO book (id, title, isbn, published_date) VALUES (1, 'This is me.', '123-444-56', '2005-09-30');
INSERT INTO book (id, title, isbn, published_date) VALUES (2, 'Hello world.', '246-777-89', '1995-03-21');
INSERT INTO book (id, title, isbn, published_date) VALUES (3, 'Apple pen', '369-000-54', '2017-11-29');

