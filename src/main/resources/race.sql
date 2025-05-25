CREATE TABLE horse_info (
                            horse_id   INT AUTO_INCREMENT PRIMARY KEY,
                            horse_name VARCHAR(50) NOT NULL,
                            color      VARCHAR(20) NOT NULL,
                            speed      INT NOT NULL,
                            stamina    INT NOT NULL,
                            emoji      VARCHAR(5)
);

CREATE TABLE race_info (
                           race_id    INT AUTO_INCREMENT PRIMARY KEY,
                           race_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE race_result (
                             result_id    INT AUTO_INCREMENT PRIMARY KEY,
                             race_id      INT NOT NULL,
                             horse_id     INT NOT NULL,
                             finish_time  DECIMAL(5,2),
                             horse_rank   INT NOT NULL,
                             horse_name   VARCHAR(50),
                             emoji        VARCHAR(5),
                             FOREIGN KEY (race_id) REFERENCES race_info(race_id)
);

INSERT INTO horse_info (horse_name, color, speed, stamina, emoji) VALUES
    ('のぞみ', 'blue',   90, 60, '🚄'),
    ('ひかり', 'red',    100, 40, '💡'),
    ('さくら', 'pink',   80, 80, '🌸'),
    ('こまち', 'purple', 70, 90, '♟️'),
    ('こだま', 'green',  75, 85, '🌧️');

