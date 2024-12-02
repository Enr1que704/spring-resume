CREATE TABLE IF NOT EXISTS Job (
    id INT NOT NULL,
    title varchar(250) NOT NULL,
    company varchar(250) NOT NULL,
    description varchar(250) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    PRIMARY KEY (id)
);