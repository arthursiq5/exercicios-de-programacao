-- lista todas as tabelas da base de dados atual
SELECT table_schema, 
        table_name, 
        table_type 
FROM information_schema.tables 
WHERE table_name like '%tabela%';
