INSERT INTO movie_entity (id, name, runtime, rating, genre, director, release_date) VALUES
  (1, 'Ready Player One', 140, 'PG-13', 'Action & Adventure, Science Fiction & Fantasy',
   'Steven Spielberg', '2018-03-29'),
  (2, 'Black Panther', 135, 'PG-13', 'Action & Adventure, Drama, Science Fiction & Fantasy',
   'Ryan Coogler', '2018-02-16');
INSERT INTO theater_entity (id, name, capacity) VALUES
  (1, 'El Capitan Theatre', 12);
INSERT INTO seat_entity (id, row, number) VALUES
  (1, 'A', 1),
  (2, 'A', 2),
  (3, 'A', 3),
  (4, 'A', 4),
  (5, 'B', 1),
  (6, 'B', 2),
  (7, 'B', 3),
  (8, 'B', 4),
  (9, 'C', 1),
  (10, 'C', 2),
  (11, 'C', 3),
  (12, 'C', 4);
INSERT INTO viewer_entity (id, username) VALUES
  (1, 'aguzman-vega'),
  (2, 'joscortez'),
  (3, 'moawad'),
  (4, 'tmiller');
INSERT INTO showtime_entity (id, time, price, movie_id) VALUES
  (1, '2018-04-01 11:30:00', 11.99, 1),
  (2, '2018-04-02 11:30:00', 11.99, 1),
  (3, '2018-04-03 11:30:00', 11.99, 1),
  (4, '2018-04-01 20:00:00', 15.99, 2),
  (5, '2018-04-02 20:00:00', 15.99, 2);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (1, 1, 1);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (1, 1, 9),
  (2, 1, 10),
  (3, 1, 11),
  (4, 1, 12);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (2, 4, 2);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (5, 2, 2),
  (6, 2, 3);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (3, 4, 3);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (7, 3, 5),
  (8, 3, 6),
  (9, 3, 7);
