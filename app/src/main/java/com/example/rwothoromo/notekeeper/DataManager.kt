package com.example.rwothoromo.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    // initializer block
    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var note = NoteInfo(
            CourseInfo("android_intents", "Android Programming with Intents"),
            "Android Programming using some kind of Intent", "course_text"
        )
        notes.add(note)

        note = NoteInfo(
            CourseInfo("android_intents", "Android Programming with Intents"),
            "Bullocks!", "This is clearly bullocks! Lol!"
        )
        notes.add(note)

        note = NoteInfo(
            CourseInfo("java_lang", "Java Fundamentals: The Java Language"),
            "Say i won't!", "Why you scared to be different?!"
        )
        notes.add(note)
    }
}