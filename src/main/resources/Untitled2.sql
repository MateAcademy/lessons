--Homework 07.02.2019:
SELECT DISTINCT
    c1.company
FROM
    orders      o1
    INNER JOIN products    p1 ON o1.product = p1.product_id
    INNER JOIN customers   c1 ON o1.cust = c1.cust_num
WHERE
    p1.description LIKE '%a%'
    OR p1.description LIKE '%Test%'
    OR p1.description LIKE '%�%'
    OR p1.description LIKE '%�%';
--

SELECT
    order_num,
    amount,
    company,
    credit_limit
FROM
    orders,
    customers
WHERE
    cust = cust_num;

SELECT
    order_num,
    amount,
    company,
    credit_limit
FROM
    orders      o1
    INNER JOIN customers   o2 ON o1.cust = o2.cust_num;

SELECT
    order_num,
    amount,
    company,
    credit_limit
FROM
    (
        SELECT
            *
        FROM
            orders
            INNER JOIN customers ON orders.cust = customers.cust_num
    );
--

SELECT
    name,
    city,
    region
FROM
    salesreps,
    offices
WHERE
    rep_office = office;

SELECT
    name,
    city,
    region
FROM
    salesreps   o1
    INNER JOIN offices     o2 ON o1.rep_office = o2.office;
--

SELECT
    city,
    name,
    title
FROM
    offices,
    salesreps
WHERE
    mgr = empl_num;

SELECT
    city,
    name,
    title
FROM
    offices     o1
    INNER JOIN salesreps   o2 ON o1.mgr = o2.empl_num;
--

SELECT
    city,
    name,
    title
FROM
    offices,
    salesreps
WHERE
    mgr = empl_num
    AND target > 600.00;

SELECT
    city,
    name,
    title
FROM
    offices     o1
    INNER JOIN salesreps   o2 ON o1.mgr = o2.empl_num
                               AND target > 600.00;
--

SELECT
    order_num,
    amount,
    description
FROM
    orders,
    products
WHERE
    mfr = mfr_id
    AND product = product_id;

SELECT
    order_num,
    amount,
    description
FROM
    orders     o1
    INNER JOIN products   o2 ON o1.mfr = o2.mfr_id
                              AND product = product_id;
--

SELECT
    order_num,
    amount,
    company,
    name
FROM
    orders,
    customers,
    salesreps
WHERE
    cust = cust_num
    AND rep = empl_num
    AND amount > 700;

SELECT
    order_num,
    amount,
    company,
    name
FROM
    orders      t1
    INNER JOIN customers   t2 ON t1.cust = t2.cust_num
    INNER JOIN salesreps   c1 ON c1.empl_num = t1.rep
                               AND amount > 700;
--

SELECT
    order_num,
    amount,
    company,
    name
FROM
    orders,
    customers,
    salesreps
WHERE
    cust = cust_num
    AND cust_rep = empl_num
    AND amount > 700;

SELECT
    order_num,
    amount,
    company,
    name
FROM
    orders      t1
    INNER JOIN customers   t2 ON t1.cust = t2.cust_num
    INNER JOIN salesreps   c1 ON c1.empl_num = t2.cust_rep
                               AND amount > 700;
--

SELECT
    order_num,
    amount,
    company,
    name,
    city
FROM
    orders,
    customers,
    salesreps,
    offices
WHERE
    cust = cust_num
    AND cust_rep = empl_num
    AND rep_office = office
    AND amount > 700;

SELECT
    order_num,
    amount,
    company,
    name,
    city
FROM
    orders      t1
    INNER JOIN customers   t2 ON t1.cust = t2.cust_num
    INNER JOIN salesreps   t3 ON t3.empl_num = t2.cust_rep
    INNER JOIN offices     t4 ON t4.office = t3.rep_office
                             AND amount > 700;
--

SELECT
    order_num,
    amount,
    order_date,
    name
FROM
    orders,
    salesreps
WHERE
    order_date = hire_date;

SELECT
    order_num,
    amount,
    order_date,
    name
FROM
    orders      t1
    INNER JOIN salesreps   t2 ON t1.order_date = t2.hire_date;
--

SELECT
    name,
    quota,
    city,
    target
FROM
    salesreps,
    offices
WHERE
    quota > target;

SELECT
    name,
    quota,
    city,
    target
FROM
    salesreps   t1
    INNER JOIN offices     t2 ON t1.quota > t2.target;
--

SELECT
    name,
    salesreps.sales,
    city
FROM
    salesreps,
    offices
WHERE
    rep_office = office;

SELECT
    name,
    t1.sales,
    city
FROM
    offices     t2
    INNER JOIN salesreps   t1 ON t1.rep_office = t2.office;
--

SELECT
    name,
    salesreps.sales,
    city
FROM
    salesreps,
    offices
WHERE
    rep_office = office;

SELECT
    name,
    t1.sales,
    city
FROM
    salesreps   t1
    INNER JOIN offices     t2 ON t1.rep_office = t2.office;
--

SELECT
    *
FROM
    salesreps,
    offices
WHERE
    rep_office = office;

SELECT
    *
FROM
    salesreps   t1
    INNER JOIN offices     t2 ON t1.rep_office = t2.office;
--

SELECT
    salesreps.*,
    city,
    region
FROM
    salesreps,
    offices
WHERE
    rep_office = office;

SELECT
    t1.*,
    city,
    region
FROM
    salesreps   t1
    INNER JOIN offices     t2 ON t1.rep_office = t2.office;
--

SELECT
    emps.name,
    mgrs.name
FROM
    salesreps   emps,
    salesreps   mgrs
WHERE
    emps.manager = mgrs.empl_num;

SELECT
    salesreps.name,
    mgrs.name
FROM
    salesreps,
    salesreps mgrs
WHERE
    salesreps.manager = mgrs.empl_num;

SELECT
    t1.name,
    t2.name
FROM
    salesreps   t1
    INNER JOIN salesreps   t2 ON t1.manager = t2.empl_num;
--

SELECT
    salesreps.name,
    salesreps.quota,
    mgrs.quota
FROM
    salesreps,
    salesreps mgrs
WHERE
    salesreps.manager = mgrs.empl_num
    AND salesreps.quota > mgrs.quota;

SELECT
    t1.name,
    t1.quota,
    t2.quota
FROM
    salesreps   t1
    INNER JOIN salesreps   t2 ON t1.manager = t2.empl_num
WHERE
    t1.quota > t2.quota;
--

SELECT
    emps.name,
    emp_office.city,
    mgrs.name,
    mgr_office.city
FROM
    salesreps   emps,
    salesreps   mgrs,
    offices     emp_office,
    offices     mgr_office
WHERE
    emps.rep_office = emp_office.office
    AND mgrs.rep_office = mgr_office.office
    AND emps.manager = mgrs.empl_num
    AND emps.rep_office <> mgrs.rep_office;

SELECT
    t1.name,
    t2.city,
    t3.name,
    t4.city
FROM
    salesreps   t1
    INNER JOIN offices     t2 ON t1.rep_office = t2.office
    INNER JOIN salesreps   t3 ON t1.manager = t3.empl_num
    INNER JOIN offices     t4 ON t1.rep_office = t4.office
                             AND t1.rep_office <> t3.rep_office;
--

SELECT
    AVG(quota),
    AVG(sales)
FROM
    salesreps;

SELECT
    name,
    city
FROM
    salesreps,
    offices;

SELECT
    AVG(100 *(sales / quota))
FROM
    salesreps;

SELECT
    AVG(100 *(sales / quota)) procent
FROM
    salesreps;

SELECT
    SUM(quota),
    SUM(sales)
FROM
    salesreps;

SELECT
    SUM(amount)
FROM
    orders      t1
    INNER JOIN salesreps   t2 ON t1.rep = t2.empl_num
WHERE
    name = 'Dima Malikov';
--

SELECT
    AVG(price)
FROM
    products
WHERE
    mfr_id = 'ACI';
--

SELECT
    AVG(amount)
FROM
    orders
WHERE
    cust = 2103;
--

SELECT
    MIN(quota),
    MAX(quota)
FROM
    salesreps;
--

SELECT
    MIN(order_date)
FROM
    orders;
--

SELECT
    MAX(100 *(sales / quota))
FROM
    salesreps;
--

SELECT
    COUNT(cust_num)
FROM
    customers;
--

SELECT
    COUNT(name)
FROM
    salesreps
WHERE
    sales > quota;
--

SELECT
    COUNT(amount)
FROM
    orders
WHERE
    amount > 250;
--

SELECT
    COUNT(*)
FROM
    orders
WHERE
    amount > 250;
--

SELECT
    AVG(amount),
    SUM(amount),
    ( 100 * AVG(amount / credit_limit) ),
    ( 100 * AVG(amount / quota) )
FROM
    orders,
    customers,
    salesreps
WHERE
    cust = cust_num
    AND rep = empl_num;

SELECT
    AVG(amount),
    SUM(amount),
    ( 100 * AVG(amount / credit_limit) ),
    ( 100 * AVG(amount / quota) )
FROM
    orders      t1
    INNER JOIN customers   t2 ON t1.cust = t2.cust_num
    INNER JOIN salesreps   t3 ON t1.rep = t3.empl_num;