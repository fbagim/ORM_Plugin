package org.ormhatch.data;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ClassGenerator {
   public abstract StringBuffer buildClass(String className, ConcurrentHashMap<String ,TableData> attributes, String pkgName) throws Exception;
   public abstract void writeClass(String className, String classStr, String fileLocation,String packageName) throws Exception;
   public abstract StringBuffer createPackage(String packageName,ConcurrentHashMap<String,TableData> attributes) throws Exception;
   public abstract StringBuffer createPackageDesc() throws Exception;
}
