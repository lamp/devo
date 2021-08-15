(ns devo
  (:require ["ink" :as i]
            ["ink-select-input" :refer [default]
                                :rename {default SelectInput}]
            ["shelljs" :as sh]
            [reagent.core :as r]
            [promesa.core :as p]))

(def workflows
  {"evs" []
   "web" []
   "shopify" []})

(defn handler [_])

(defn selector []
  (let [items (map (fn [t] {:label t :value t}) (keys workflows))]
    [:> i/Box {:width 8 :flex-direction "column"}
       [:> SelectInput {:on-select handler :items items}]]))

(i/render (r/as-element [selector]))
