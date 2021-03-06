/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectModerationLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of labels for explicit or suggestive adult content found in the image. The list includes the top-level
     * label and each child label detected in the image. This is useful for filtering specific categories of content.
     * </p>
     */
    private java.util.List<ModerationLabel> moderationLabels;

    /**
     * <p>
     * A list of labels for explicit or suggestive adult content found in the image. The list includes the top-level
     * label and each child label detected in the image. This is useful for filtering specific categories of content.
     * </p>
     * 
     * @return A list of labels for explicit or suggestive adult content found in the image. The list includes the
     *         top-level label and each child label detected in the image. This is useful for filtering specific
     *         categories of content.
     */

    public java.util.List<ModerationLabel> getModerationLabels() {
        return moderationLabels;
    }

    /**
     * <p>
     * A list of labels for explicit or suggestive adult content found in the image. The list includes the top-level
     * label and each child label detected in the image. This is useful for filtering specific categories of content.
     * </p>
     * 
     * @param moderationLabels
     *        A list of labels for explicit or suggestive adult content found in the image. The list includes the
     *        top-level label and each child label detected in the image. This is useful for filtering specific
     *        categories of content.
     */

    public void setModerationLabels(java.util.Collection<ModerationLabel> moderationLabels) {
        if (moderationLabels == null) {
            this.moderationLabels = null;
            return;
        }

        this.moderationLabels = new java.util.ArrayList<ModerationLabel>(moderationLabels);
    }

    /**
     * <p>
     * A list of labels for explicit or suggestive adult content found in the image. The list includes the top-level
     * label and each child label detected in the image. This is useful for filtering specific categories of content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModerationLabels(java.util.Collection)} or {@link #withModerationLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param moderationLabels
     *        A list of labels for explicit or suggestive adult content found in the image. The list includes the
     *        top-level label and each child label detected in the image. This is useful for filtering specific
     *        categories of content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationLabels(ModerationLabel... moderationLabels) {
        if (this.moderationLabels == null) {
            setModerationLabels(new java.util.ArrayList<ModerationLabel>(moderationLabels.length));
        }
        for (ModerationLabel ele : moderationLabels) {
            this.moderationLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels for explicit or suggestive adult content found in the image. The list includes the top-level
     * label and each child label detected in the image. This is useful for filtering specific categories of content.
     * </p>
     * 
     * @param moderationLabels
     *        A list of labels for explicit or suggestive adult content found in the image. The list includes the
     *        top-level label and each child label detected in the image. This is useful for filtering specific
     *        categories of content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationLabels(java.util.Collection<ModerationLabel> moderationLabels) {
        setModerationLabels(moderationLabels);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModerationLabels() != null)
            sb.append("ModerationLabels: ").append(getModerationLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectModerationLabelsResult == false)
            return false;
        DetectModerationLabelsResult other = (DetectModerationLabelsResult) obj;
        if (other.getModerationLabels() == null ^ this.getModerationLabels() == null)
            return false;
        if (other.getModerationLabels() != null && other.getModerationLabels().equals(this.getModerationLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModerationLabels() == null) ? 0 : getModerationLabels().hashCode());
        return hashCode;
    }

    @Override
    public DetectModerationLabelsResult clone() {
        try {
            return (DetectModerationLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
