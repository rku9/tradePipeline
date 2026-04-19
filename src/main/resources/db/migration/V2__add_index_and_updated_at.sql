create index idx_orders_user_id on orders(user_id);
create index idx_orders_symbol on orders(symbol);
create index idx_orders_user_status on orders(user_id, status);

alter table orders add column updated_at timestamptz;