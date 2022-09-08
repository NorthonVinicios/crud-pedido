SELECT nome_produto, CASE WHEN id_produto IN (SELECT produto FROM produto_pedido)
                  THEN 'sim'
                  ELSE 'não'
             END AS vendido
FROM produto;
