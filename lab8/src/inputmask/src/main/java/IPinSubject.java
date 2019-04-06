public interface IPinSubject {
    /**
     * Add a Pin Auth Observer
     *
     * @param obj Observer Object
     */
    void registerObserver(IPinObserver obj);

    /**
     * Remove Observer
     *
     * @param obj Pin AUth Observer to Remove
     */
    void removeObserver(IPinObserver obj);

    /**
     * Authentication notifier subject
     */
    void notifyObserver();
}
