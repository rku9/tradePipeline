create type order_side as enum('BUY', 'SELL');
create type order_type as enum('LIMIT', 'MARKET');
create type order_status as enum('PROCESSING', 'PROCESSED',
'PARTIAL', 'REJECTED');


create table orders (
    id                    uuid primary key default gen_random_uuid(),
    user_id               uuid not null,
    symbol                varchar(4) not null,
    side order_side       not null,
    type order_type not null,
    price_requested       numeric(19, 4),
    price_matched         numeric(19, 4),
    qty_requested         numeric(19, 4) not null,
    qty_matched           numeric(19, 4) not null default 0,
    status order_status   not null default 'PROCESSING',
    rejected_reason       varchar(50),
    arrived_at            timestamptz not null default now()
);