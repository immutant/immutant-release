(defproject org.immutant/immutant-common "1.0.3-SNAPSHOT"
  :description "Common utilities and functions used by all the Immutant namespaces."
  :plugins [[lein-modules "0.1.1-SNAPSHOT"]
            [org.immutant/build-plugin "0.1.0-SNAPSHOT"]]
  :modules {:parent "../project.clj"}
  :dependencies [[cheshire/cheshire _]
                 [org.clojure/data.fressian "0.2.0"]
                 [org.clojure/tools.reader "0.7.6"]
                 [org.jboss.msc/jboss-msc "1.0.4.GA"]
                 [org.tcrawley/dynapath "0.2.3"]])