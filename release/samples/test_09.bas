//Atomic boolean conditional

LET A = 1
LET X = 10
IF A <> X THEN
    LET Y = 1
ELSE
    LET Y = 0
END IF

IF A < 0 AND A > 0 OR A = 1 THEN
    LET F = 1
ELSE
    LET F = 0
END IF

IF NOT A < 0 AND A = 1 THEN
    LET K = 1
ELSE
    LET K = 0
END IF
