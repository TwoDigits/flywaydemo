CREATE TABLE NOTES (
    ID UUID primary key,
    TEXT VARCHAR(255),
    ASSIGNEE VARCHAR(255),
    TO_BE_DONE_BY timestamp,
    DONE boolean
)