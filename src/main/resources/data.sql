INSERT INTO authors(id, name)
VALUES (10001, 'Robert Martin');
INSERT INTO authors(id, name)
VALUES (10002, 'Steve McConnell');

INSERT INTO books(id, title, author_id)
VALUES (20001, 'Clean Code: A Handbook of Agile Software Craftsmanship', 10001);
INSERT INTO books(id, title, author_id)
VALUES (20002, 'Code Complete: A Practical Handbook of Software Construction', 10002);

INSERT INTO reviews(id, book_id, rating, description)
VALUES (30001, 20001, 5, 'Great book!');
INSERT INTO reviews(id, book_id, rating, description)
VALUES (30002, 20001, 4, 'I really enjoyed reading this book.');
INSERT INTO reviews(id, book_id, rating, description)
VALUES (30003, 20002, 5, 'Definitely worth a read.');
