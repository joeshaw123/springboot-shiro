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
public class Role implements Serializable {

    private static final long serialVersionUID = 1561609670212L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer rId;

    /**
    * 
    * isNullAble:1
    */
    private String rolename;


    public void setRId(Integer rId){this.rId = rId;}

    public Integer getRId(){return this.rId;}

    public void setRolename(String rolename){this.rolename = rolename;}

    public String getRolename(){return this.rolename;}
    @Override
    public String toString() {
        return "Role{" +
                "rId='" + rId + '\'' +
                "rolename='" + rolename + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Role set;

        private ConditionBuilder where;

        public UpdateBuilder set(Role set){
            this.set = set;
            return this;
        }

        public Role getSet(){
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

    public static class QueryBuilder extends Role{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> rIdList;

        public List<Integer> getRIdList(){return this.rIdList;}

        private Integer rIdSt;

        private Integer rIdEd;

        public Integer getRIdSt(){return this.rIdSt;}

        public Integer getRIdEd(){return this.rIdEd;}

        private List<String> rolenameList;

        public List<String> getRolenameList(){return this.rolenameList;}


        private List<String> fuzzyRolename;

        public List<String> getFuzzyRolename(){return this.fuzzyRolename;}

        private List<String> rightFuzzyRolename;

        public List<String> getRightFuzzyRolename(){return this.rightFuzzyRolename;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder rIdBetWeen(Integer rIdSt,Integer rIdEd){
            this.rIdSt = rIdSt;
            this.rIdEd = rIdEd;
            return this;
        }

        public QueryBuilder rIdGreaterEqThan(Integer rIdSt){
            this.rIdSt = rIdSt;
            return this;
        }
        public QueryBuilder rIdLessEqThan(Integer rIdEd){
            this.rIdEd = rIdEd;
            return this;
        }


        public QueryBuilder rId(Integer rId){
            setRId(rId);
            return this;
        }

        public QueryBuilder rIdList(Integer ... rId){
            this.rIdList = solveNullList(rId);
            return this;
        }

        public QueryBuilder rIdList(List<Integer> rId){
            this.rIdList = rId;
            return this;
        }

        public QueryBuilder fetchRId(){
            setFetchFields("fetchFields","rId");
            return this;
        }

        public QueryBuilder excludeRId(){
            setFetchFields("excludeFields","rId");
            return this;
        }

        public QueryBuilder fuzzyRolename (List<String> fuzzyRolename){
            this.fuzzyRolename = fuzzyRolename;
            return this;
        }

        public QueryBuilder fuzzyRolename (String ... fuzzyRolename){
            this.fuzzyRolename = solveNullList(fuzzyRolename);
            return this;
        }

        public QueryBuilder rightFuzzyRolename (List<String> rightFuzzyRolename){
            this.rightFuzzyRolename = rightFuzzyRolename;
            return this;
        }

        public QueryBuilder rightFuzzyRolename (String ... rightFuzzyRolename){
            this.rightFuzzyRolename = solveNullList(rightFuzzyRolename);
            return this;
        }

        public QueryBuilder rolename(String rolename){
            setRolename(rolename);
            return this;
        }

        public QueryBuilder rolenameList(String ... rolename){
            this.rolenameList = solveNullList(rolename);
            return this;
        }

        public QueryBuilder rolenameList(List<String> rolename){
            this.rolenameList = rolename;
            return this;
        }

        public QueryBuilder fetchRolename(){
            setFetchFields("fetchFields","rolename");
            return this;
        }

        public QueryBuilder excludeRolename(){
            setFetchFields("excludeFields","rolename");
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

        public Role build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> rIdList;

        public List<Integer> getRIdList(){return this.rIdList;}

        private Integer rIdSt;

        private Integer rIdEd;

        public Integer getRIdSt(){return this.rIdSt;}

        public Integer getRIdEd(){return this.rIdEd;}

        private List<String> rolenameList;

        public List<String> getRolenameList(){return this.rolenameList;}


        private List<String> fuzzyRolename;

        public List<String> getFuzzyRolename(){return this.fuzzyRolename;}

        private List<String> rightFuzzyRolename;

        public List<String> getRightFuzzyRolename(){return this.rightFuzzyRolename;}

        public ConditionBuilder rIdBetWeen(Integer rIdSt,Integer rIdEd){
            this.rIdSt = rIdSt;
            this.rIdEd = rIdEd;
            return this;
        }

        public ConditionBuilder rIdGreaterEqThan(Integer rIdSt){
            this.rIdSt = rIdSt;
            return this;
        }
        public ConditionBuilder rIdLessEqThan(Integer rIdEd){
            this.rIdEd = rIdEd;
            return this;
        }


        public ConditionBuilder rIdList(Integer ... rId){
            this.rIdList = solveNullList(rId);
            return this;
        }

        public ConditionBuilder rIdList(List<Integer> rId){
            this.rIdList = rId;
            return this;
        }

        public ConditionBuilder fuzzyRolename (List<String> fuzzyRolename){
            this.fuzzyRolename = fuzzyRolename;
            return this;
        }

        public ConditionBuilder fuzzyRolename (String ... fuzzyRolename){
            this.fuzzyRolename = solveNullList(fuzzyRolename);
            return this;
        }

        public ConditionBuilder rightFuzzyRolename (List<String> rightFuzzyRolename){
            this.rightFuzzyRolename = rightFuzzyRolename;
            return this;
        }

        public ConditionBuilder rightFuzzyRolename (String ... rightFuzzyRolename){
            this.rightFuzzyRolename = solveNullList(rightFuzzyRolename);
            return this;
        }

        public ConditionBuilder rolenameList(String ... rolename){
            this.rolenameList = solveNullList(rolename);
            return this;
        }

        public ConditionBuilder rolenameList(List<String> rolename){
            this.rolenameList = rolename;
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

        private Role obj;

        public Builder(){
            this.obj = new Role();
        }

        public Builder rId(Integer rId){
            this.obj.setRId(rId);
            return this;
        }
        public Builder rolename(String rolename){
            this.obj.setRolename(rolename);
            return this;
        }
        public Role build(){return obj;}
    }

}
