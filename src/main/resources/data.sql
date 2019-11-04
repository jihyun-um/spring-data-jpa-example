INSERT INTO authors(id, name)
VALUES (20001, 'Robert Martin');
INSERT INTO authors(id, name)
VALUES (20002, 'Steve McConnell');

INSERT INTO books(id, title, author_id)
VALUES (10001, 'Clean Code: A Handbook of Agile Software Craftsmanship', 20001);
INSERT INTO books(id, title, author_id)
VALUES (10002, 'Code Complete: A Practical Handbook of Software Construction', 20002);

INSERT INTO reviews(id, book_id, rating, description)
VALUES (30001, 10001, 5, 'Great book!');
INSERT INTO reviews(id, book_id, rating, description)
VALUES (30002, 10001, 4, 'I really enjoyed reading this book.');
INSERT INTO reviews(id, book_id, rating, description)
VALUES (30003, 10002, 5, 'Definitely worth a read.');
