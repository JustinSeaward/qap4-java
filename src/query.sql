CREATE TABLE Drugs (
    Id SERIAL PRIMARY KEY,
    name Text NOT NULL,
    cost DECIMAL(10,2) NOT NULL,
    dosage TEXT NOT NULL
)