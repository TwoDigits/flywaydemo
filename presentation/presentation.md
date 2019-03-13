<section data-markdown data-separator="^\n----\n$" data-vertical="^\n---\n$">

![ogo](./images/flyway-logo.png)
## Introduction and Best Practices

---

## What is Flyway

* Open Source
* Handles Database Migration
* Versioned & immutable SQL Scripts

----

## What are the benefits

* Reproducible db state
* Know the version your db is in
* Quick and easy setup of new environments
* Supports zero-downtime updates

----

## How does it work?

![ogo](./images/schema_version.png)

* Schema version table
* Flyway checks all version
    * Fails on checksum mismatch
    * Only applies not already executed scripts
    
----

## How to use it?

* Command Line (flyway migrate)
* Java API --> Spring integration
* Maven API
* Gradle API

---

## Best Pratices

* Use idempotent operations
    * Check if item already exists
* Use Baseline (if DB already set up without flyway)
* Use DB independent scripts
* Do not add sample data

----

## Best Pratices Continued

* Do not create users with migrations
* Always roll forward
* Do not change existing scripts
* Stay backwards compatible to the previous software version

---

# Demo

</section>
