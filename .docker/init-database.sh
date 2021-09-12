#!/bin/bash

set -e
# psql -v --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
#     CREATE SCHEMA "$POSTGRES_SCHEMA" AUTHORIZATION $POSTGRES_USER;
#     CREATE USER postgres SUPERUSER;
# EOSQL

psql -v --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -f /tmp/pais.sql
psql -v --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -f /tmp/estado.sql
psql -v --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -f /tmp/cidade.sql