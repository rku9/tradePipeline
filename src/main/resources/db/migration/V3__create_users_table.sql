create table users(
    id uuid primary key default pg_catalog.gen_random_uuid(),
    email varchar(255) not null,
    created_at timestamptz default now() not null
)