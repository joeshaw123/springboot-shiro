package com.joeshaw.demo.shirodemo.pojo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author joeshaw
*/
public class Permission implements Serializable {

    private static final long serialVersionUID = 1561609662485L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer pId;

    /**
    * 
    * isNullAble:0
    */
    private String pname;

    /**
    * 
    * isNullAble:0
    */
    private String url;


    public void setPId(Integer pId){this.pId = pId;}

    public Integer getPId(){return this.pId;}

    public void setPname(String pname){this.pname = pname;}

    public String getPname(){return this.pname;}

    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}
    @Override
    public String toString() {
        return "Permission{" +
                "pId='" + pId + '\'' +
                "pname='" + pname + '\'' +
                "url='" + url + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Permission set;

        private ConditionBuilder where;

        public UpdateBuilder set(Permission set){
            this.set = set;
            return this;
        }

        public Permission getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Permission{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> pIdList;

        public List<Integer> getPIdList(){return this.pIdList;}

        private Integer pIdSt;

        private Integer pIdEd;

        public Integer getPIdSt(){return this.pIdSt;}

        public Integer getPIdEd(){return this.pIdEd;}

        private List<String> pnameList;

        public List<String> getPnameList(){return this.pnameList;}


        private List<String> fuzzyPname;

        public List<String> getFuzzyPname(){return this.fuzzyPname;}

        private List<String> rightFuzzyPname;

        public List<String> getRightFuzzyPname(){return this.rightFuzzyPname;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder pIdBetWeen(Integer pIdSt,Integer pIdEd){
            this.pIdSt = pIdSt;
            this.pIdEd = pIdEd;
            return this;
        }

        public QueryBuilder pIdGreaterEqThan(Integer pIdSt){
            this.pIdSt = pIdSt;
            return this;
        }
        public QueryBuilder pIdLessEqThan(Integer pIdEd){
            this.pIdEd = pIdEd;
            return this;
        }


        public QueryBuilder pId(Integer pId){
            setPId(pId);
            return this;
        }

        public QueryBuilder pIdList(Integer ... pId){
            this.pIdList = solveNullList(pId);
            return this;
        }

        public QueryBuilder pIdList(List<Integer> pId){
            this.pIdList = pId;
            return this;
        }

        public QueryBuilder fetchPId(){
            setFetchFields("fetchFields","pId");
            return this;
        }

        public QueryBuilder excludePId(){
            setFetchFields("excludeFields","pId");
            return this;
        }

        public QueryBuilder fuzzyPname (List<String> fuzzyPname){
            this.fuzzyPname = fuzzyPname;
            return this;
        }

        public QueryBuilder fuzzyPname (String ... fuzzyPname){
            this.fuzzyPname = solveNullList(fuzzyPname);
            return this;
        }

        public QueryBuilder rightFuzzyPname (List<String> rightFuzzyPname){
            this.rightFuzzyPname = rightFuzzyPname;
            return this;
        }

        public QueryBuilder rightFuzzyPname (String ... rightFuzzyPname){
            this.rightFuzzyPname = solveNullList(rightFuzzyPname);
            return this;
        }

        public QueryBuilder pname(String pname){
            setPname(pname);
            return this;
        }

        public QueryBuilder pnameList(String ... pname){
            this.pnameList = solveNullList(pname);
            return this;
        }

        public QueryBuilder pnameList(List<String> pname){
            this.pnameList = pname;
            return this;
        }

        public QueryBuilder fetchPname(){
            setFetchFields("fetchFields","pname");
            return this;
        }

        public QueryBuilder excludePname(){
            setFetchFields("excludeFields","pname");
            return this;
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Permission build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> pIdList;

        public List<Integer> getPIdList(){return this.pIdList;}

        private Integer pIdSt;

        private Integer pIdEd;

        public Integer getPIdSt(){return this.pIdSt;}

        public Integer getPIdEd(){return this.pIdEd;}

        private List<String> pnameList;

        public List<String> getPnameList(){return this.pnameList;}


        private List<String> fuzzyPname;

        public List<String> getFuzzyPname(){return this.fuzzyPname;}

        private List<String> rightFuzzyPname;

        public List<String> getRightFuzzyPname(){return this.rightFuzzyPname;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}

        public ConditionBuilder pIdBetWeen(Integer pIdSt,Integer pIdEd){
            this.pIdSt = pIdSt;
            this.pIdEd = pIdEd;
            return this;
        }

        public ConditionBuilder pIdGreaterEqThan(Integer pIdSt){
            this.pIdSt = pIdSt;
            return this;
        }
        public ConditionBuilder pIdLessEqThan(Integer pIdEd){
            this.pIdEd = pIdEd;
            return this;
        }


        public ConditionBuilder pIdList(Integer ... pId){
            this.pIdList = solveNullList(pId);
            return this;
        }

        public ConditionBuilder pIdList(List<Integer> pId){
            this.pIdList = pId;
            return this;
        }

        public ConditionBuilder fuzzyPname (List<String> fuzzyPname){
            this.fuzzyPname = fuzzyPname;
            return this;
        }

        public ConditionBuilder fuzzyPname (String ... fuzzyPname){
            this.fuzzyPname = solveNullList(fuzzyPname);
            return this;
        }

        public ConditionBuilder rightFuzzyPname (List<String> rightFuzzyPname){
            this.rightFuzzyPname = rightFuzzyPname;
            return this;
        }

        public ConditionBuilder rightFuzzyPname (String ... rightFuzzyPname){
            this.rightFuzzyPname = solveNullList(rightFuzzyPname);
            return this;
        }

        public ConditionBuilder pnameList(String ... pname){
            this.pnameList = solveNullList(pname);
            return this;
        }

        public ConditionBuilder pnameList(List<String> pname){
            this.pnameList = pname;
            return this;
        }

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Permission obj;

        public Builder(){
            this.obj = new Permission();
        }

        public Builder pId(Integer pId){
            this.obj.setPId(pId);
            return this;
        }
        public Builder pname(String pname){
            this.obj.setPname(pname);
            return this;
        }
        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Permission build(){return obj;}
    }

}
