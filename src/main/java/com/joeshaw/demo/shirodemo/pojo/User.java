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
public class User implements Serializable {

    private static final long serialVersionUID = 1561609655266L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer uId;

    /**
    * 
    * isNullAble:0
    */
    private String username;

    /**
    * 
    * isNullAble:0
    */
    private String password;

    /**
    * 
    * isNullAble:1
    */
    private String key;


    public void setUId(Integer uId){this.uId = uId;}

    public Integer getUId(){return this.uId;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setKey(String key){this.key = key;}

    public String getKey(){return this.key;}
    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
                "key='" + key + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> uIdList;

        public List<Integer> getUIdList(){return this.uIdList;}

        private Integer uIdSt;

        private Integer uIdEd;

        public Integer getUIdSt(){return this.uIdSt;}

        public Integer getUIdEd(){return this.uIdEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> keyList;

        public List<String> getKeyList(){return this.keyList;}


        private List<String> fuzzyKey;

        public List<String> getFuzzyKey(){return this.fuzzyKey;}

        private List<String> rightFuzzyKey;

        public List<String> getRightFuzzyKey(){return this.rightFuzzyKey;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder uIdBetWeen(Integer uIdSt,Integer uIdEd){
            this.uIdSt = uIdSt;
            this.uIdEd = uIdEd;
            return this;
        }

        public QueryBuilder uIdGreaterEqThan(Integer uIdSt){
            this.uIdSt = uIdSt;
            return this;
        }
        public QueryBuilder uIdLessEqThan(Integer uIdEd){
            this.uIdEd = uIdEd;
            return this;
        }


        public QueryBuilder uId(Integer uId){
            setUId(uId);
            return this;
        }

        public QueryBuilder uIdList(Integer ... uId){
            this.uIdList = solveNullList(uId);
            return this;
        }

        public QueryBuilder uIdList(List<Integer> uId){
            this.uIdList = uId;
            return this;
        }

        public QueryBuilder fetchUId(){
            setFetchFields("fetchFields","uId");
            return this;
        }

        public QueryBuilder excludeUId(){
            setFetchFields("excludeFields","uId");
            return this;
        }

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyKey (List<String> fuzzyKey){
            this.fuzzyKey = fuzzyKey;
            return this;
        }

        public QueryBuilder fuzzyKey (String ... fuzzyKey){
            this.fuzzyKey = solveNullList(fuzzyKey);
            return this;
        }

        public QueryBuilder rightFuzzyKey (List<String> rightFuzzyKey){
            this.rightFuzzyKey = rightFuzzyKey;
            return this;
        }

        public QueryBuilder rightFuzzyKey (String ... rightFuzzyKey){
            this.rightFuzzyKey = solveNullList(rightFuzzyKey);
            return this;
        }

        public QueryBuilder key(String key){
            setKey(key);
            return this;
        }

        public QueryBuilder keyList(String ... key){
            this.keyList = solveNullList(key);
            return this;
        }

        public QueryBuilder keyList(List<String> key){
            this.keyList = key;
            return this;
        }

        public QueryBuilder fetchKey(){
            setFetchFields("fetchFields","key");
            return this;
        }

        public QueryBuilder excludeKey(){
            setFetchFields("excludeFields","key");
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

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> uIdList;

        public List<Integer> getUIdList(){return this.uIdList;}

        private Integer uIdSt;

        private Integer uIdEd;

        public Integer getUIdSt(){return this.uIdSt;}

        public Integer getUIdEd(){return this.uIdEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> keyList;

        public List<String> getKeyList(){return this.keyList;}


        private List<String> fuzzyKey;

        public List<String> getFuzzyKey(){return this.fuzzyKey;}

        private List<String> rightFuzzyKey;

        public List<String> getRightFuzzyKey(){return this.rightFuzzyKey;}

        public ConditionBuilder uIdBetWeen(Integer uIdSt,Integer uIdEd){
            this.uIdSt = uIdSt;
            this.uIdEd = uIdEd;
            return this;
        }

        public ConditionBuilder uIdGreaterEqThan(Integer uIdSt){
            this.uIdSt = uIdSt;
            return this;
        }
        public ConditionBuilder uIdLessEqThan(Integer uIdEd){
            this.uIdEd = uIdEd;
            return this;
        }


        public ConditionBuilder uIdList(Integer ... uId){
            this.uIdList = solveNullList(uId);
            return this;
        }

        public ConditionBuilder uIdList(List<Integer> uId){
            this.uIdList = uId;
            return this;
        }

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyKey (List<String> fuzzyKey){
            this.fuzzyKey = fuzzyKey;
            return this;
        }

        public ConditionBuilder fuzzyKey (String ... fuzzyKey){
            this.fuzzyKey = solveNullList(fuzzyKey);
            return this;
        }

        public ConditionBuilder rightFuzzyKey (List<String> rightFuzzyKey){
            this.rightFuzzyKey = rightFuzzyKey;
            return this;
        }

        public ConditionBuilder rightFuzzyKey (String ... rightFuzzyKey){
            this.rightFuzzyKey = solveNullList(rightFuzzyKey);
            return this;
        }

        public ConditionBuilder keyList(String ... key){
            this.keyList = solveNullList(key);
            return this;
        }

        public ConditionBuilder keyList(List<String> key){
            this.keyList = key;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder uId(Integer uId){
            this.obj.setUId(uId);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder key(String key){
            this.obj.setKey(key);
            return this;
        }
        public User build(){return obj;}
    }

}
