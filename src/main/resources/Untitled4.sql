--Homework 11.02.2019
SELECT
    COUNT(*),
    COUNT(sales),
    COUNT(quota)
FROM
    salesreps;
--

SELECT
    SUM(sales),
    SUM(quota),
    ( SUM(sales) - SUM(quota) ),
    ( SUM(sales - quota) )
FROM
    salesreps;
--

SELECT
    COUNT(DISTINCT title)
FROM
    salesreps;
--

SELECT
    COUNT(DISTINCT rep_office)
FROM
    salesreps
WHERE
    sales > quota;
--

SELECT
    AVG(amount)
FROM
    orders;
--

SELECT
    rep,
    AVG(amount)
FROM
    orders
GROUP BY
    rep;
--

SELECT
    rep_office,
    MIN(quota),
    MAX(quota)
FROM
    salesreps
GROUP BY
    rep_office;
--Сколько служащих работают в каждом офисе?

SELECT
    rep_office,
    COUNT(*)
FROM
    salesreps
GROUP BY
    rep_office;
--

SELECT
    COUNT(DISTINCT cust_num),
    'CUSTOMERS FOR SALESREPS',
    cust_rep
FROM
    customers
GROUP BY
    cust_rep;
--

SELECT
    rep,
    cust,
    SUM(amount)
FROM
    orders
GROUP BY
    rep,
    cust;
--

SELECT
    rep,
    cust,
    SUM(amount)
FROM
    orders
GROUP BY
    rep,
    cust
ORDER BY
    rep,
    cust;
--

SELECT
    empl_num,
    name,
    SUM(amount)
FROM
    orders,
    salesreps
WHERE
    rep = empl_num
GROUP BY
    empl_num,
    name;
--

SELECT
    name,
    SUM(amount)
FROM
    orders      ord
    INNER JOIN salesreps   sal ON ord.rep = sal.empl_num
GROUP BY
    name;
--

SELECT
    hair,
    eyes,
    COUNT(*)
FROM
    coloris
GROUP BY
    hair,
    eyes;
--

SELECT
    rep,
    AVG(amount),
    SUM(amount)
FROM
    orders
GROUP BY
    rep
HAVING
    SUM(amount) > 300;
--

SELECT
    city,
    SUM(quota),
    SUM(salesreps.sales)
FROM
    offices,
    salesreps
WHERE
    office = rep_office
GROUP BY
    city
HAVING
    COUNT(*) >= 2;

SELECT
    off.city,
    SUM(sal.quota),
    SUM(sal.sales)
FROM
    offices     off
    INNER JOIN salesreps   sal ON off.office = sal.rep_office
GROUP BY
    off.city
HAVING
    COUNT(*) >= 2;
--

SELECT
    description,
    price,
    qty_on_hand,
    SUM(qty)
FROM
    products,
    orders
WHERE
    mfr = mfr_id
GROUP BY
    mfr_id,
    product_id,
    description,
    price,
    qty_on_hand
HAVING
    SUM(qty) > ( 0.75 * qty_on_hand )
ORDER BY
    qty_on_hand DESC;

SELECT
    description,
    price,
    qty_on_hand,
    SUM(qty)
FROM
    products   prod
    INNER JOIN orders     ord ON prod.mfr_id = ord.mfr
GROUP BY
    mfr_id,
    product_id,
    description,
    price,
    qty_on_hand
HAVING
    SUM(qty) > ( 0.75 * qty_on_hand )
ORDER BY
    qty_on_hand DESC;

/* 1. Скільки яких товірів купляли (скільки штук і чого купили всього) */

SELECT
    p.description,
    o.product,
    SUM(o.qty)
FROM
    products   p
    INNER JOIN orders     o ON p.product_id = o.product
GROUP BY
    o.product,
    p.description;

/*2. Вивести товари, які купили більше 3-оьх разів (були в трьох і більше замовленнях) */

SELECT
    products.description,
    COUNT(orders.product) AS count
FROM
    products
    INNER JOIN orders ON products.product_id = orders.product
GROUP BY
    orders.product,
    products.description
HAVING
    COUNT(orders.product) > 3;

/*3. Вивести офіси в яких працює більше трьох менеджерів:*/

SELECT
    off.office,
    off.city,
    COUNT(s.rep_office)
FROM
    salesreps   s
    INNER JOIN offices     off ON s.rep_office = off.office
GROUP BY
    off.office,
    off.city
HAVING
    COUNT(s.rep_office) > 3;
--приклад з підзапитом:

SELECT
    office,
    city,
    rep_office
FROM
    (
        SELECT
            offices.office,
            offices.city,
            COUNT(salesreps.rep_office) AS rep_office
        FROM
            offices
            INNER JOIN salesreps ON offices.office = salesreps.rep_office
        GROUP BY
            offices.office,
            offices.city
    ) of_city_count
WHERE
    of_city_count.rep_office > 3;

/*4. Вивести середній вік по офісу*/

SELECT
    o.office,
    o.city,
    AVG(s.age)
FROM
    salesreps   s
    INNER JOIN offices     o ON s.rep_office = o.office
GROUP BY
    o.office,
    o.city;

/*5. Дати перелік виробників що виготовляють більше 4-ьох товарів  */

SELECT
    pr.mfr_id,
    COUNT(pr.product_id)
FROM
    products pr
GROUP BY
    pr.mfr_id
HAVING
    COUNT(pr.product_id) > 4;

/*6. Дати загальну кільсть товарів, що зберігаються на складі по виробникам що виготовляють більше 4-ьох товарів*/

SELECT
    pr.mfr_id,
    COUNT(pr.product_id),
    SUM(pr.qty_on_hand)
FROM
    products pr
GROUP BY
    pr.mfr_id
HAVING
    COUNT(pr.product_id) > 4;

/* Варiант з пiдзапитом*/

SELECT
    pr.mfr_id,
    COUNT(pr.product_id),
    SUM(pr.qty_on_hand)
FROM
    products pr
    INNER JOIN (
        SELECT
            mfr_id,
            COUNT(product_id),
            SUM(qty_on_hand)
        FROM
            products
        GROUP BY
            mfr_id
        HAVING
            COUNT(product_id) > 4
    ) mfr ON pr.mfr_id = mfr.mfr_id
GROUP BY
    pr.mfr_id;

/* 7. Вивести імя компанії, скільки вона тратила в середньому на покупки товарів виробників, котрі виготовляють більше 4-ьох товарів */

SELECT
    c.cust_num,
    c.company,
    AVG(s.sales) AS avg_sales,
    o.mfr
FROM
    customers   c
    INNER JOIN orders      o ON c.cust_num = o.cust
    INNER JOIN salesreps   s ON c.cust_rep = s.empl_num
    INNER JOIN (
        SELECT
            mfr_id,
            COUNT(product_id)
        FROM
            products
        GROUP BY
            mfr_id
        HAVING
            COUNT(product_id) > 4
    ) mfr ON o.mfr = mfr.mfr_id
GROUP BY
    c.company,
    c.cust_num,
    o.mfr;

/*8. Вивести скільки мінімально і максимально замовлень (ордерів) виконували менеджери що мають в прямому підпорядкуванні більше двух людей*/

SELECT
    MIN(orders_num),
    MAX(orders_num)
FROM
    (
        SELECT
            COUNT(order_num) AS orders_num,
            o.rep
        FROM
            orders o
            INNER JOIN (
                SELECT
                    COUNT(s1.empl_num),
                    s1.empl_num
                FROM
                    salesreps   s1
                    INNER JOIN salesreps   s2 ON s1.empl_num = s2.manager
                GROUP BY
                    s1.empl_num
                HAVING
                    COUNT(s1.empl_num) > 2
            ) s3 ON o.rep = s3.empl_num
        GROUP BY
            o.rep
    );

/*9. Знайти продукти в яких буква "а" зустрічається більше 2-ух раз */

SELECT
    *
FROM
    products
WHERE
    description LIKE '%а%а%а%';
--

SELECT
    pr.mfr_id,
    COUNT(pr.product_id)
FROM
    products pr
    INNER JOIN (
        SELECT
            mfr_id,
            COUNT(product_id)
        FROM
            products
        GROUP BY
            mfr_id
        HAVING
            COUNT(product_id) > 4
    ) mfr ON pr.mfr_id = mfr.mfr_id
GROUP BY
    pr.mfr_id;
--

SELECT
    description,
    product,
    SUM(qty)
FROM
    (
        SELECT
            *
        FROM
            products   pr
            INNER JOIN orders     o ON pr.product_id = o.product
    )
GROUP BY
    product,
    description;
--

SELECT
    office,
    city,
    AVG(age)
FROM
    (
        SELECT
            *
        FROM
            salesreps   s
            INNER JOIN offices     off ON s.rep_office = off.office
    )
GROUP BY
    office,
    city;
--

INSERT INTO girls VALUES (
    1,
    'Mary',
    'Boston'
);

INSERT INTO girls (
    nm,
    city
) VALUES (
    18,
    'BOSTON'
);

UPDATE boys
SET
    nm = 20
WHERE
    name = 'Bob';

UPDATE boys
SET
    name = 'Sunya',
    city = 'Kev'
WHERE
    nm = 1;

DELETE FROM girls
WHERE
    nm = 1;

DELETE FROM girls
WHERE
    name = 'Susan'
    AND city = 'Denver';