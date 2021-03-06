 (defproject org.immutant/immutant-modules-parent "1.1.2-SNAPSHOT"
  :description "Parent for all modules"
  :parent [org.immutant/immutant-parent _ :relative-path "../pom.xml"]
  :plugins [[lein-modules "0.2.4"]]
  :packaging "pom"
  
  :profiles  {:dev {:dependencies [[org.immutant/immutant-clojure-test-support _]
                                   [org.immutant/immutant-as-test-support _]]
                    :hooks [immutant.build.plugin.modules/hooks]}})
