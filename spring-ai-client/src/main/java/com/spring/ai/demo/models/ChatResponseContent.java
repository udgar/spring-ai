package com.spring.ai.demo.models;

public class ChatResponseContent {
        private String exerciseName;
        private String exerciseType;
        private String bodyTypeAffected;

        public String getExerciseName() {
            return exerciseName;
        }

        public void setExerciseName(String exerciseName) {
            this.exerciseName = exerciseName;
        }

        public String getExerciseType() {
            return exerciseType;
        }

        public void setExerciseType(String exerciseType) {
            this.exerciseType = exerciseType;
        }

        public String getBodyTypeAffected() {
            return bodyTypeAffected;
        }

        public void setBodyTypeAffected(String bodyTypeAffected) {
            this.bodyTypeAffected = bodyTypeAffected;
        }
    }