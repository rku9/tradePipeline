INSERT INTO users (id, email, created_at)
SELECT
    gen_random_uuid(),
    'user' || gs || '@trade.com',
    now()
FROM generate_series(1, 100) AS gs;