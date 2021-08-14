(ns devo
  (:require ["ink" :as i]
            ["shelljs" :as sh]
            [reagent.core :as r]
            [promesa.core :as p]))


(def workflows
  {"evs" []
   "web" []
   "shopify" []})


(defn selector []
  [:> i/Box {:width 8 :flex-direction "column"}
   (map (fn [t] [:> i/Text {:color "red" :key t} t]) (keys workflows))])

(let [{waitUntilExit :witUntilExit} (i/render (r/as-element [selector]))]
  (waitUntilExit))
