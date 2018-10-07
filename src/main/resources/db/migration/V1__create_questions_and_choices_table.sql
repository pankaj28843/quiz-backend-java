CREATE TABLE questions (
    id BIGSERIAL PRIMARY KEY,
    is_published BOOLEAN NOT NULL,
    maximum_marks INTEGER NOT NULL,
    question_text TEXT NOT NULL
);

CREATE TABLE question_choices (
    id BIGSERIAL PRIMARY KEY,
	question_id INTEGER NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
	is_correct BOOLEAN NOT NULL,
	choice_text TEXT NOT NULL
);