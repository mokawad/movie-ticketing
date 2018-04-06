INSERT INTO movie_entity (id, name, runtime, rating, genre, director, release_date) VALUES
  (0, 'Ready Player One', 140, 'PG-13', 'Action & Adventure, Science Fiction & Fantasy',
   'Steven Spielberg', '2018-03-29'),
  (1, 'Black Panther', 135, 'PG-13', 'Action & Adventure, Drama, Science Fiction & Fantasy',
   'Ryan Coogler', '2018-02-16'),
  (2, 'Isle of Dogs', 101, 'PG-13', 'Action & Adventure, Animation, Comedy',
   'Wes Anderson', '2018-03-23'),
  (3, 'A Quiet Place', 90, 'PG-13', 'Horror, Suspense & Thriller',
   'John Krasinski', '2018-04-06'),
  (4, 'Pacific Rim Uprising', 110, 'PG-13', 'Action & Adventure, Science Fiction & Fantasy',
   'Steven S. Deknight', '2018-03-23'),
  (5, 'Rampage', 107, 'PG-13', 'Action & Adventure',
   'Brad Peyton', '2018-04-13'),
  (6, 'Borg vs McEnroe', 107, 'R', 'Drama',
   'Janus Metz Pedersen', '2018-04-13'),
  (7, 'Beirut', 109, 'R', 'Drama',
   'Brad Anderson', '2018-04-11'),
  (8, 'Super Troopers 2', 99, 'R', 'Comedy',
   'Jay Chandrasekhar', '2018-04-20'),
  (9, 'Avengers: Infinity War', 156, 'NR', 'Action & Adventure, Science Fiction & Fantasy',
   'Anthony Russo', '2018-04-27'),
  (10, 'Deadpool 2', 111, 'NR', 'Action & Adventure, Comedy',
   'David Leitch', '2018-05-18'),
  (11, 'Solo: A Star Wars Story', 120, 'NR', 'Action & Adventure, Science Fiction & Fantasy',
   'Ron Howard', '2018-05-22'),
  (12, 'Toy Story 4', 90, 'NR', 'Action & Adventure, Animated',
   'John Lasseter', '2018-06-21'),
  (13, 'Jurassic World: Fallen Kingdom', 120, 'NR', 'Action & Adventure',
   'Chris Pratt', '2018-06-22');
INSERT INTO theater_entity (id, name, capacity) VALUES
  (0, 'El Capitan Theatre', 12);
INSERT INTO seat_entity (id, row, number) VALUES
  (0, 'A', 1),
  (1, 'A', 2),
  (2, 'A', 3),
  (3, 'A', 4),
  (4, 'B', 1),
  (5, 'B', 2),
  (6, 'B', 3),
  (7, 'B', 4),
  (8, 'C', 1),
  (9, 'C', 2),
  (10, 'C', 3),
  (11, 'C', 4);
INSERT INTO viewer_entity (id, username) VALUES
  (0, 'aguzman-vega'),
  (1, 'joscortez'),
  (2, 'moawad'),
  (3, 'tmiller');
INSERT INTO showtime_entity (id, time, price, movie_id) VALUES
  (0, '2018-04-01 11:30:00', 11.99, 0),
  (1, '2018-04-02 11:30:00', 11.99, 0),
  (2, '2018-04-03 11:30:00', 11.99, 0),
  (3, '2018-04-01 20:00:00', 15.99, 1),
  (4, '2018-04-02 20:00:00', 15.99, 1);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (0, 0, 0);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (0, 0, 8),
  (1, 0, 9),
  (2, 0, 10),
  (3, 0, 11);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (1, 4, 2);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (4, 1, 2),
  (5, 1, 3);

INSERT INTO booking_entity (id, showtime_id, viewer_id) VALUES
  (3, 4, 3);
INSERT INTO seats_entity (id, booking_id, seat_id) VALUES
  (7, 3, 5),
  (8, 3, 6),
  (9, 3, 7);
