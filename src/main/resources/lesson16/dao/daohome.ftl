${pojo.getPackageDeclaration()}
// Generated ${date} by Hibernate Tools ${version}

<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>/**
 * Home object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Hibernate Tools
 */

public class ${declarationName}DAO {

    private static final ${pojo.importType("org.apache.logging.log4j.Logger")} LOG = ${pojo.importType("org.apache.logging.log4j.LogManager")}.getLogger(${pojo.getDeclarationName()}DAO.class);

<#if ejb3>
    @${pojo.importType("javax.persistence.PersistenceContext")} private ${pojo.importType("javax.persistence.EntityManager")} entityManager;
    
    public void persist(${declarationName} transientInstance) {
        LOG.debug("persisting ${declarationName} instance");
        try {
            entityManager.persist(transientInstance);
            LOG.debug("persist successful");
        }
        catch (RuntimeException re) {
            LOG.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(${declarationName} persistentInstance) {
        LOG.debug("removing ${declarationName} instance");
        try {
            entityManager.remove(persistentInstance);
            LOG.debug("remove successful");
        }
        catch (RuntimeException re) {
            LOG.error("remove failed", re);
            throw re;
        }
    }
    
    public ${declarationName} merge(${declarationName} detachedInstance) {
        LOG.debug("merging ${declarationName} instance");
        try {
            ${declarationName} result = entityManager.merge(detachedInstance);
            LOG.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            LOG.error("merge failed", re);
            throw re;
        }
    }
    
<#if clazz.identifierProperty?has_content>    
    public ${declarationName} findById( ${pojo.getJavaTypeName(clazz.identifierProperty, jdk5)} id) {
        LOG.debug("getting ${declarationName} instance with id: " + id);
        try {
            ${declarationName} instance = entityManager.find(${pojo.getDeclarationName()}.class, id);
            LOG.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            LOG.error("get failed", re);
            throw re;
        }
    }
</#if>
<#else>    
    private final ${pojo.importType("org.hibernate.SessionFactory")} sessionFactory = getSessionFactory();
    
    protected ${pojo.importType("org.hibernate.SessionFactory")} getSessionFactory() {
        try {
            return (${pojo.importType("org.hibernate.SessionFactory")}) new ${pojo.importType("javax.naming.InitialContext")}().lookup("${sessionFactoryName}");
        }
        catch (Exception e) {
            LOG.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(${declarationName} transientInstance) {
        LOG.debug("persisting ${declarationName} instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            LOG.debug("persist successful");
        }
        catch (RuntimeException re) {
            LOG.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(${declarationName} instance) {
        LOG.debug("attaching dirty ${declarationName} instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            LOG.debug("attach successful");
        }
        catch (RuntimeException re) {
            LOG.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(${declarationName} instance) {
        LOG.debug("attaching clean ${declarationName} instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, ${pojo.importType("org.hibernate.LockMode")}.NONE);
            LOG.debug("attach successful");
        }
        catch (RuntimeException re) {
            LOG.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(${declarationName} persistentInstance) {
        LOG.debug("deleting ${declarationName} instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            LOG.debug("delete successful");
        }
        catch (RuntimeException re) {
            LOG.error("delete failed", re);
            throw re;
        }
    }
    
    public ${declarationName} merge(${declarationName} detachedInstance) {
        LOG.debug("merging ${declarationName} instance");
        try {
            ${declarationName} result = (${declarationName}) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            LOG.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            LOG.error("merge failed", re);
            throw re;
        }
    }
    
<#if clazz.identifierProperty?has_content>
    public ${declarationName} findById( ${c2j.getJavaTypeName(clazz.identifierProperty, jdk5)} id) {
        LOG.debug("getting ${declarationName} instance with id: " + id);
        try {
            ${declarationName} instance = (${declarationName}) sessionFactory.getCurrentSession()
                    .get("${clazz.entityName}", id);
            if (instance==null) {
                LOG.debug("get successful, no instance found");
            }
            else {
                LOG.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            LOG.error("get failed", re);
            throw re;
        }
    }
</#if>
    
<#if clazz.hasNaturalId()>
    public ${declarationName} findByNaturalId(${c2j.asNaturalIdParameterList(clazz)}) {
        LOG.debug("getting ${declarationName} instance by natural id");
        try {
            ${declarationName} instance = (${declarationName}) sessionFactory.getCurrentSession()
                    .createCriteria("${clazz.entityName}")
<#if jdk5>
                    .add( ${pojo.staticImport("org.hibernate.criterion.Restrictions", "naturalId")}()
<#else>
                   .add( ${pojo.importType("org.hibernate.criterion.Restrictions")}.naturalId()
</#if>                    
<#foreach property in pojo.getAllPropertiesIterator()>
<#if property.isNaturalIdentifier()>
                            .set("${property.name}", ${property.name})
</#if>
</#foreach>
                        )
                    .uniqueResult();
            if (instance==null) {
                LOG.debug("get successful, no instance found");
            }
            else {
                LOG.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            LOG.error("query failed", re);
            throw re;
        }
    }
</#if>    
<#if jdk5>
    public ${pojo.importType("java.util.List")}<${declarationName}> findByExample(${declarationName} instance) {
<#else>
    public ${pojo.importType("java.util.List")} findByExample(${declarationName} instance) {
</#if>
        LOG.debug("finding ${declarationName} instance by example");
        try {
<#if jdk5>
            ${pojo.importType("java.util.List")}<${declarationName}> results = (List<${declarationName}>) sessionFactory.getCurrentSession()
<#else>
            ${pojo.importType("java.util.List")} results = sessionFactory.getCurrentSession()
</#if>
                    .createCriteria("${clazz.entityName}")
<#if jdk5>
                    .add( ${pojo.staticImport("org.hibernate.criterion.Example", "create")}(instance) )
<#else>
                    .add(${pojo.importType("org.hibernate.criterion.Example")}.create(instance))
</#if>
            .list();
            LOG.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            LOG.error("find by example failed", re);
            throw re;
        }
    } 
<#foreach query in md.namedQueryDefinitions>
<#assign queryName = query.name>
<#if queryName.startsWith(clazz.entityName + ".")>
<#assign methname = c2j.unqualify(queryName)>
<#assign params = c2j.getParameterTypes(query)>
<#assign argList = c2j.asFinderArgumentList(params, pojo)>
<#if jdk5 && methname.startsWith("find")>
    public ${pojo.importType("java.util.List")}<${declarationName}> ${methname}(${argList}) {
<#elseif methname.startsWith("count")>
    public int ${methname}(${argList}) {
<#else>
    public ${pojo.importType("java.util.List")} ${methname}(${argList}) {
</#if>
        ${pojo.importType("org.hibernate.Query")} query = sessionFactory.getCurrentSession()
                .getNamedQuery("${queryName}");
<#foreach param in params.keySet()>
<#if param.equals("maxResults")>
		query.setMaxResults(maxResults);
<#elseif param.equals("firstResult")>
        query.setFirstResult(firstResult);
<#else>
        query.setParameter("${param}", ${param});
</#if>
</#foreach>
<#if jdk5 && methname.startsWith("find")>
        return (List<${declarationName}>) query.list();
<#elseif methname.startsWith("count")>
        return ( (Integer) query.uniqueResult() ).intValue();
<#else>
        return query.list();
</#if>
    }
</#if>
</#foreach></#if>
}
</#assign>

${pojo.generateImports()}
${classbody}
