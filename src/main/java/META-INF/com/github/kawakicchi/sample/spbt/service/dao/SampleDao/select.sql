
SELECT
    id
  , name
  , date
FROM
    tm_sample
WHERE
    name like /* bean.name */'USER' & '%'
